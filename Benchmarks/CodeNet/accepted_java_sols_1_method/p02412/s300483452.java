import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<String[]>();
        while(true) {
          String line = sc.nextLine();
          String[] linesp = line.split(" ");
          
          if(linesp[0].equals("0") && linesp[1].equals("0")) {
              break;
          }
          list.add(linesp);
        }
        for(int i = 0; i < list.size(); i++) {
            int sum = 0;
            int n = Integer.parseInt(list.get(i)[0]);
            int x = Integer.parseInt(list.get(i)[1]);
            for(int j = 1; j <= n; j++) {
                for(int k = j; k <= n; k++) {
                    for(int l = k; l <= n; l++) {
                        if(j != k && j!= l && k != l) {
                            if(j + k + l == x) {
                                sum += 1;
                            }
                        }
                    }
                }
            }
            System.out.println(sum);
        }
  }
}
