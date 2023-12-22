import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char[] c = str.toCharArray();
       int sam = str.length();
       int ki0=0;int ki1=0;int gu0=0;int gu1=0;
       int min1 = 0; int min2=0;int ans =0;
     
     if(sam>=2){
     
     for(int i =0;i<sam;i=i+2){//奇数の各数
      if(c[i]=='0'){ki0++;}
       else{ki1++;}
     }
          for(int i =1;i<sam;i=i+2){//偶数の各数
      if(c[i]=='0'){gu0++;}
       else{gu1++;}
     }
     
      min1 = ki0+gu1;
      min2 = ki1+gu0;
      ans = Math.min(min1,min2);
      System.out.print(ans);

      
     }else{
       System.out.print(0);
     }
     


   }
}
