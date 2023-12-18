import java.util.*;
class Main
{
	public static void main(String[] args)	
	{
        Scanner sc=new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
        if(str.equals("0")) break;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
             char a = str.charAt(i);
        if (Character.isDigit(a)) {
            int n = Integer.parseInt(String.valueOf(a));
            sum = sum + n;
            }
        }
            System.out.println(sum);
        }
    }
}
