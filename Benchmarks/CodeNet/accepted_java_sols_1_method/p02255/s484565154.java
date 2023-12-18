import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String[] numArry = sc.nextLine().split(" ");
            for(int m=0;m<cnt;m++){
                System.out.print(numArry[m]);
                if(m == cnt -1){
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }

        for(int i=1;i<cnt;i++){
            int v = Integer.parseInt(numArry[i]);
            int j = i - 1;
            while(j>=0 && Integer.parseInt(numArry[j]) > v){
                numArry[j+1] = numArry[j];
                j--;
            }
            numArry[j+1] = Integer.toString(v);
            for(int m=0;m<cnt;m++){
                System.out.print(numArry[m]);
                if(m == cnt -1){
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}
