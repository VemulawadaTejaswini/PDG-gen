import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j,sum;
        int[] num = new int[3];
        int[][] a;
        int[] b;
        while(true){
            str = scan.nextLine();
            String[] x = str.split(" ", 0);
            for(i = 0; i < 3; i++){
                num[i] = Integer.valueOf(x[i]);
            }
            if(num[0]==-1&&num[1]==-1&&num[2]==-1){
                break;
            }
            if(num[0]==-1||num[1]==-1){
                System.out.println("F");
                continue;
            }
            if(num[0]+num[1]>=80){
                System.out.println("A");
                continue;
            }
            if(num[0]+num[1]>=65){
                System.out.println("B");
                continue;
            }
            if(num[0]+num[1]>=50){
                System.out.println("C");
                continue;
            }
            if(num[0]+num[1]>=30){
                if(num[2]>=50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
                continue;
            }
            System.out.println("F");
            continue;
        }
        
        scan.close();
    }
}
