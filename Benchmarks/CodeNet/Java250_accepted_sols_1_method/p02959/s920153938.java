import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Integer towns = Integer.parseInt(sc.nextLine());
        String[] Monsters = sc.nextLine().split(" ");
        String[] Braves = sc.nextLine().split(" ");

        long huntCount = 0;
        for (int i = 0; i < towns; i++) {
            int firstMonsters = Integer.parseInt(Monsters[i]);
            int bravePower = Integer.parseInt(Braves[i]);

            if (firstMonsters <= bravePower) {
                // 1つ目の町は全滅できる
                huntCount += firstMonsters;

                int secondMonsters = Integer.parseInt(Monsters[i + 1]);
                int remainBravePower = bravePower - firstMonsters;
                if (remainBravePower >= secondMonsters) {
                    // 2個目の町も全滅できる
                    huntCount += secondMonsters;
                    Monsters[i + 1] = String.valueOf(0);
                } else {

                    // ちょっと残る
                    huntCount += remainBravePower;
                    Monsters[i + 1] = String.valueOf(secondMonsters - remainBravePower);
                }
            } else {

                // 1個目の町も全滅できないが何匹かは倒せる
                huntCount += bravePower;
            }
            System.err.println(huntCount);
        }

        System.err.println();
        System.out.println(huntCount);
    }
}
