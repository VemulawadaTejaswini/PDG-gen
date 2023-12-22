import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int t = sc.nextInt();
            int r = sc.nextInt();
            
            	if(m == -1&& t == -1){
                    if(t == -1 && r == -1){
                        break;
                    }
                }
            if(m == -1 || t == -1){
                System.out.println("F");
            }else if(m + t >= 80){
                System.out.println("A");
            }else if(m + t >= 65){
                System.out.println("B");
            }else if(m + t >= 50){
                System.out.println("C");
            }else if(m + t >= 30 && r >= 50){
                System.out.println("C");
            }else if(m + t >= 30){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }
    }
}
