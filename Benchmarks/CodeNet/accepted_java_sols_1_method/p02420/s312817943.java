import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String S = sc.next();
            	if(S.equals("-"))
                    break;
            String s = S;
            int m = sc.nextInt();
            for(int i=0;i<m;i++){
                int h = sc.nextInt();
                 	String s1 = s.substring(h);
                 	String s2 = s.substring(0,h);
               		s = s1 + s2;
            }
            System.out.println(s);
        }
        sc.close();
    }
}
