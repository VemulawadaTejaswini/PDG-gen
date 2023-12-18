public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
  	Integer[] numList = scan.nextLine();
    
    System.out.println(numList);
  
  	Integer result=10;
  	for(int i=0;i<5;i++){
    	result-=numList[i];
    }
    System.out.println(result);
  }
}
