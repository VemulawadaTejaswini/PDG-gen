import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

char c = scan.next().charAt(0);
    if(c=='a' || c=='e' || c == 'i' || c =='o' ||c=='u'){
      System.out.println("vowel");
    }else{
      System.out.println("consonant");
    }
    
    
  }
}
