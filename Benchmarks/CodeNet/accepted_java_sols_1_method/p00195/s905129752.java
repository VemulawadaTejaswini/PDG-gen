import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
  
    int s1, s2;
    

    String ch[] = {"A","B","C","D","E"};

    s1 = scan.nextInt();
    while( s1 > 0){
        s2 = scan.nextInt();
        
        int max_type = 0;
        int max_s = s1 + s2;
      
        for(int i=1; i<5; ++i){
            s1 = scan.nextInt();
            s2 = scan.nextInt();
            if( max_s < s1 + s2 ){
                max_s = s1 + s2;
                max_type = i;
            }
        }
      
        System.out.println(ch[max_type] +" "+ max_s);
      
        s1 = scan.nextInt();
    }
  }
}
