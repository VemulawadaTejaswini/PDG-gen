import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
                int i,j = 0;
                double c=0,d=0;
                double e[] = new double[1000];
                Scanner num = new Scanner(System.in);
                double a = num.nextDouble();
                double b = num.nextDouble();
                if(a>b){
                    c = a%b;
                    d = b;
                }else if(a==b){
                    System.out.printf("%.0f\n",a);
                    System.exit(0);
                }else{
                    c = b%a;
                    d = a;
                }
                for(i=1;i<=c;i++){
                    if(c%i==0){
                        e[j]=i;
                        j++;
                    }
                }
                for(i=j-1;i>0;i--){
                    if(d%e[i] == 0){
                        double yaku = e[i];
                        break;
                    }
                }
                System.out.printf("%.0f\n",e[i]);
        }
    }
