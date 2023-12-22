import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); 
    //AはBより場所が1つ多い
    int a[] =new int[n];
    int b[] =new int[n-1];
    int ans = 0;
//配列B格納
    for(int i=0; i<b.length; ++i){
      b[i] = sc.nextInt();
    }
//とりあえずAにBを格納
   for(int i=0; i<b.length; ++i){
		    a[i]=b[i];
		}
    //AのラストにBのラストを格納
		a[(n-1)]=b[(n-2)];
    //Aに入ってるやつより、直前のBのほうが小さかったら更新
		for(int i=1; i<a.length; ++i){
		    if(a[i]>b[(i-1)]){
		        a[i]=b[(i-1)];
		    }
		}
    
    
    for(int i = 0; i < a.length; ++i){
      ans = ans + a[i];
    }

    System.out.println(ans);
  }
}
