import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            if(s.equals("-"))
                break;
        	int len=s.length();
        	int m=sc.nextInt();
        	for(int i=0;i<m;i++){
                String[] S=s.split("");
                String s1="",s2="";
            	int n=sc.nextInt();
                for(int j=0;j<n;j++){
                    s1+=S[j];
                }
                for(int j=n;j<len;j++){
                    s2+=S[j];
                }
            	s=s2+s1;
        	}
        	System.out.println(s);
        }
        sc.close();
    }
}
    
