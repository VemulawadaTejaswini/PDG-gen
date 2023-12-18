public class Main { 
   public static void main(String[] args){
      try(Scanner sc = new Scanner){
	  int a = sc.nextInt();
	  String op = sc.nextInt();
	  int b = sc.nextInt();
          if(op.equals("?")){
              break;
          } else {
             calc(a, op, b);
          }
      } catch (Exception e){
          e.printStackTrace();
      }
   }
  
   private static int calc(int x,String op, int y){
       switch (op) {
	  case "+":
	    int ans = x + y;
	    break;
	  case "-":
	    int ans = x - y;
	    break;
	  case "*":	  	  
	    int ans = x * y;
	    break;
	  case "/":
	    int ans = x / y;
	    break;
	  case default:
	    System.out.println("??????????????¨?????????????????????")
       }
       System.out.println(ans);
   }
}