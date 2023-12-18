import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String ch ="";
        int t,f;


        for(int i=0;i<n;i++){
            String test = sc.next();

            if(test.equals("replace")){
            	t=sc.nextInt();
            	f=sc.nextInt();
            	ch = sc.next();
            	String str1 = str.substring(0,t);
            	String str2 = str.substring(f+1);
            	str =str1+ch+str2;

            }
            else if(test.equals("reverse")){
            	t=sc.nextInt();
            	f=sc.nextInt();
            	char rev[]= str.substring(t,f+1).toCharArray();
            	char rev2[] = new char[rev.length];
            	for(int j=0;j<rev.length;j++){
            		rev2[j]=rev[rev.length-1-j];
            	}
            	str=str.replaceFirst(str.substring(t,f+1),String.valueOf(rev2));


            }else if(test.equals("print")){
            	t=sc.nextInt();
            	f=sc.nextInt();
            	System.out.println(str.substring(t,f+1));

            }else{
            	System.out.println("EEE");
            }



        }
        sc.close();
    }

}

