import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long pre_total = 0;
    long total = 0;
    int mojisuu = 0;

    long n = sc.nextInt();

    while(n>total){
      mojisuu++;
      //pre_total = total;
      total += Math.pow(26,mojisuu);
    }

    int[] array = new int[mojisuu];
    //n = n -pre_total;


      for(int i=0; i<mojisuu; i++){
        if(mojisuu - 1== i){
          array[mojisuu-1] = (int)n;
        }else{
          //System.out.println("!!"+n % 26);
          array[i] = (int)(n % 26);
          n = n / 26;
        }
      }
      //0x61 = ９７ = a

      StringBuilder val = new StringBuilder();

      for(int i = mojisuu-1; i>-1; i--){
        //System.out.println(alpha(array[i]));
        val.append(alpha(array[i]));
      }
      System.out.println(val);







    // System.out.println("mojisu: "+mojisuu);
    // for(long a:array){
    //   System.out.println(a);
    // }




  }

  static char alpha(int n){
    if(n==0){
      return 'z';
    }else{
      return (char)(n+96);
    }
  }
}