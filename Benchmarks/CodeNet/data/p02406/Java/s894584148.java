import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for(int i = 1; i < a+1; i++){
                int x = i;
                if (x % 3 == 0) {
                    System.out.print(" " + i);
                }
                else {
                    while(true){
                        if(x % 10 == 3){
                            System.out.print(" "+i);
                        }
                        x /= 10;
                        if(x != 0){
                            continue;
                        }else{
                            break;
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }

