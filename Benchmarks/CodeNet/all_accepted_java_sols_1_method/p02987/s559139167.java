import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(s.charAt(i)==s.charAt(j)){
                    sum++;
                }
            }
        }
        if(sum==8){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}