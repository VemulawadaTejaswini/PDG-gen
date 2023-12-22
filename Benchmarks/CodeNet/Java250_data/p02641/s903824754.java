import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n = sc.nextInt();
        int p[] = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
        }
        int ans = 0;


        for(int i = 0;i<105;i++){
            int tmp = x + i;
            int tmpp = x - i;
            boolean tmplus  = true;
            boolean tmpminus = true;
            int j = 0;
            while (tmplus||tmpminus){
                if(j == n){
                    break;
                }
                if(p[j]==tmp){
                    tmplus =false;
                }
                if(p[j]==tmpp){
                    tmpminus = false;

                }

                j++;
            }
            if(tmplus&&tmpminus){
                System.out.println(x-i);
                System.exit(0);
            }
            else if(tmplus&&!tmpminus){
                System.out.println(x+i);
                System.exit(0);
            }
            else if(!tmplus&&tmpminus){
                System.out.println(x-i);
                System.exit(0);
            }



        }

    }

}
