class Main{
 
public static void main(String[] args){
  int count5 = 0;
  int count7 = 0;
  
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  
  for(int i = 0; i < 3; i++){
  	String str = scanner.next();
    if(str.equals("5")){
      count5++;
    } else if(str.equals("7")){
      count7++;
    }
  }
  
  if(count5 == 2 && count7 == 1){
  	System.out.println("YES");
  }else {
  	System.out.println("NO");
  }
}
}