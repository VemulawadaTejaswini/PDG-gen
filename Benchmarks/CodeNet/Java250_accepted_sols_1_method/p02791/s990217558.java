import java.util.*;
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	int min=sc.nextInt();
	int temp=0;
	for(int i=0; i<(t-1); i++){
		int k=sc.nextInt();
		if(k<min){
		  min=k;
		  temp++;}
	}
	System.out.println(temp+1);
  }
}