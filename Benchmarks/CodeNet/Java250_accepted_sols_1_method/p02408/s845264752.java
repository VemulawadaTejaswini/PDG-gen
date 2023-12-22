import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[][] card = new boolean[4][13];
        int number = scan.nextInt();

        if (number == 52) {
            return;
        }
        while(number != 0) {
            char image = scan.next().charAt(0);
            int num = scan.nextInt() - 1;

            switch (image) {
                case 'S':
                    card[0][num] = true;
                    break;
                case 'H':
                    card[1][num] = true;
                    break;
                case 'C':
                    card[2][num] = true;
                    break;
                case 'D':
                    card[3][num] = true;
                    break;
            }
            number--;
        }
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                if (card[i][j] == false) {
                    switch(i) {
                        case 0:
                            sb.append("S").append(" ").append(j + 1).append("\n");
                            break;
                        case 1:
                            sb.append("H").append(" ").append(j + 1).append("\n");
                            break;
                        case 2:
                            sb.append("C").append(" ").append(j + 1).append("\n");
                            break;
                        case 3:
                            sb.append("D").append(" ").append(j + 1).append("\n");
                            break;
                    }
                }
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}