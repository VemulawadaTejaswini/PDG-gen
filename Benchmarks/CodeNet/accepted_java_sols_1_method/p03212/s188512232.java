import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
          	Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		sc.close();
            int M=0;
            int i=357;
            while(i<=N){
                int a=0;
                int b=0;
                int c=0;
                int d=0;
                for(int j=i;j>0;j/=10){
                    if(j%10==3){
                        a++;
                    }else if(j%10==5){
                        b++;
                    }else if(j%10==7){
                        c++;
                    }else{
                        d++;
                        break;
                    }
                }
                if(a!=0&&b!=0&&c!=0&&d==0){
                    M++;
                }
                if(i%100==37||i%10==57){
                  i+=16;
                }else if(i%100==77){
                  i+=56;
                }else {
                  i+=2; 
                }
            }
            System.out.println(M);
        }
    }