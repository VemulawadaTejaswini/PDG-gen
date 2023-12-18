import java.util.*;
class Sample{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%1000==0)
    System.out.println(n);
    else { 
    int m = ((n/1000)+1)*1000;
    m = m-n;
    System.out.println(m);
    }
      //  System.out.println("Hello World");
    }
}
