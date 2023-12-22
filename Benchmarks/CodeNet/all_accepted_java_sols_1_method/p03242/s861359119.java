    import java.util.Scanner;
    class Main{
        public static void main(String arg[]){
            Scanner scn=new Scanner(System.in);
            String n=scn.next();
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)=='9'){
                    System.out.print('1');
                }else{
                    System.out.print('9');
                }
            }
            System.out.println();
        }
    }