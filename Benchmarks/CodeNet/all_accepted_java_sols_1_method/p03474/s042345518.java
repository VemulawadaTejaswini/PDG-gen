import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                int a=scn.nextInt();
                int b=scn.nextInt();
                String str=scn.next();
                char c;
                for(int i=0;i<a;i++){
                        c=str.charAt(i);
                        if('0'>c || c>'9'){
                                System.out.println("No");
                                return;
                        }
                }

                if(str.charAt(a)!='-'){
                        System.out.println("No");
                        return;
                }
                for(int i=0;i<b;i++){
                        c=str.charAt(a+1+i);
                        if('0'>c || c>'9'){
                                System.out.println("No");
                                return;
                        }
                }
                System.out.println("Yes");
        }
}