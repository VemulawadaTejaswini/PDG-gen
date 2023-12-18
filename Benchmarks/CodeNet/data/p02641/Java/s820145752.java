import java.util.*;

class Main{

  public static boolean checker(int a,int[] List){
    for(int i=0;i<List.length;i++){
     if(List[i]==a) return false; 
    }
    return true;
  }
  
  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
	int X=s.nextInt();
    int N=s.nextInt();
    int[] List=new int[N];
    for(int i=0;i<N;i++) List[i]=s.nextInt();
    
    int cnt=0;
    int num=X+cnt;
    do{
      if(checker(num,List)){
        System.out.println(num);
        break;
      }
      cnt+=1;
      if(num-X<0) num+=cnt;
      else num-=cnt;
    }while(true);
    
  }  
}