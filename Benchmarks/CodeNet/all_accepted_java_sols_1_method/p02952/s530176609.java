import java.util.Scanner;
class Main{
  public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int count=0;
    for(int i=0;i<=5;i++){
    	if(num/((int)Math.pow(10,i))>0){
        	count=i+1;
        }else{
        	break;
        }
    }
    int answer=0;
    for(int i=1;i<=count;i++){
      	if(i%2==1 && i!=count){
        	answer+=(int)Math.pow(10,i)-(int)Math.pow(10,i-1);
        }else if(i%2==1 && i==count){
        	int add=num-(int)Math.pow(10,i-1)+1;
          	answer+=add;
        }else if(i%2==0){
        	continue;
        }
    }
    System.out.println(answer);
  }
}