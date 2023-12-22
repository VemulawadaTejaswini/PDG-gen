 import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Member = sc.nextInt();
    int Point =  sc.nextInt();
    int Times = sc.nextInt();
    int Answers[] = new int[Times];
    int Member_Point[]=new int[Member];
    
    for(int i=0;i<Member;i++){
    	Member_Point[i]=Point-Times;
    }
    for(int i=0;i<Times;i++){
        Answers[i]=sc.nextInt();
    }
    for(int i=0;i<Times;i++){
        Member_Point[Answers[i]-1]+=1;
    }
   for(int i=0;i<Member;i++){
    	if(Member_Point[i]<=0){
      	System.out.println("No");
        }else{
        	System.out.println("Yes");
        } 
    }
  }
}

  