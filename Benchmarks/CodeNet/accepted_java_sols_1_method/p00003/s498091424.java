import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int count = scan.nextInt();
                for(int i=0;i<count;i++){
                        int a,b,c;
                        int one = scan.nextInt();
                        int two = scan.nextInt();
                        int three = scan.nextInt();
                        
                        if(one > two && two > three){
                                c = one;
                                b = two;
                                a = three;
                        }
                        else if(one > three && three > two){
                                c = one;
                                b = three;
                                a = two;
                        }
                        else if(two > one && one > three){
                                c = two;
                                b = one;
                                a = three;
                        }
                        else if(two > three && three > one){
                                c = two;
                                b = three;
                                a = one;
                        }
                        else if(three > one && one >two){
                                c = three;
                                b = one;
                                a = two;
                        }
                        else{
                                c = three;
                                b = one;
                                a = two;
                        }

                        if(a*a+b*b==c*c){
                                System.out.println("YES");
                        }
                        else{
                                System.out.println("NO");
                        }
                }

        
        }
}