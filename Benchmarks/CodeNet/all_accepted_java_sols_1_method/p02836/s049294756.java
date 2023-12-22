import java.util.Scanner;
class Main{
	public static void main(String[] aegs){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int count = 0;
      	int i =	0;
      	int j = s.length() - 1;
      	for(;i<j;){
        	if(s.charAt(i) != s.charAt(j))
            	count++;
            i++;
            j--;
        }
        System.out.println(count);
      	sc.close();
    }
}