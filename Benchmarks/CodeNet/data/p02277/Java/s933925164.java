import java.util.*;
import java.io.*;

class Main{
  static int n;
  static Card cards[];
  public static void main(String[] args){
      int i;
      try{
          InputStreamReader ir = new InputStreamReader(System.in);
           BufferedReader buffer = new BufferedReader (ir);
           String str1 = buffer.readLine();
           n = Integer.parseInt(str1);
           cards = new Card[n];
      for(i=0;i<n;i++){
  			String[] str2 = buffer.readLine().split(" ");
  			cards[i] = new Card(str2[0], Integer.parseInt(str2[1]), i);
  		}
    }catch(IOException e){
        System.out.println("error1");
    }
    quickSort(cards,0,n-1);
    if(isStable(cards,n)==true){
      System.out.println("Stable");
    }
    else{
      System.out.println("Not stable");
    }
    for(i=0;i<n;i++){
      System.out.println(cards[i].mark+" "+cards[i].number);
    }
  }
  private static void quickSort(Card c[],int p,int r){
    int q;
    if(p<r){
      q = partition(c,p,r);
      quickSort(c,p,q-1);
      quickSort(c,q+1,r);
    }
  }

  private static int partition(Card c[],int p,int r){
         int i,j,x;
         Card card;

         x = c[r].number;
         i = p-1;
         for(j=p;j<r;j++){
             if(c[j].number<=x){
                 i++;
                 card = c[i];
                 c[i] = c[j];
                 c[j] = card;
             }
         }
         card = c[i+1];
         c[i+1] = c[r];
         cards[r] = card;
         return i+1;
     }
     private static boolean isStable(Card[] c, int n){
       int i;
		for(i=1;i<n;i++){
			if(c[i-1].number == c[i].number && c[i-1].order > c[i].order){
				return false;
			}
		}
		return true;
	}
  public static class Card{
   public String mark;
   public int number;
   public int order;
   Card(String mark, int number, int order){
     this.mark = mark;
     this.number = number;
     this.order = order;
   }
  }

}

