import java.util.Scanner ;

class Main {
  public static void main(String[] args) {   
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt() ;
    String m[] = new String[n];
    String str[] = new String[n];
    double sum = 0 ; 
    for(int i=0 ; i< n ; i++){
      m[i] = scan.next();
      str[i] = scan.next();
      if(str[i].equals("BTC")){
        sum +=Double.parseDouble(m[i])*380000.0;
      }else{
        sum+=Double.parseDouble(m[i]);
      }
    }
    System.out.println(sum);
    
    
  }
}
