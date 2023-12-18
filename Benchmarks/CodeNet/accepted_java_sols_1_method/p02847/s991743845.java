import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        if(s.equals("SUN")){
            System.out.println('7');
        }
        if(s.equals("MON")){
            System.out.println('6');
        }
        if(s.equals("TUE")){
            System.out.println('5');
        }
        if(s.equals("WED")){
            System.out.println('4');
        }
        if(s.equals("THU")){
            System.out.println('3');
        }
        if(s.equals("FRI")){
            System.out.println('2');
        }
        if(s.equals("SAT")){
            System.out.println('1');
        }
    }
}