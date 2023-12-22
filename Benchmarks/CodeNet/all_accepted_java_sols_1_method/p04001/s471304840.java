import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    long sum = 0,tmp_sum = 0;
    int len = s.length;
    long tmp = 0;
    for(int i=0;i<(1<<(len-1));i++){
      tmp = 0;
      tmp_sum = 0;
      
      for(int j=0;j<len-1;j++){
        if( ((i>>(len -2 -j)) & 1) ==1){
          tmp_sum = tmp_sum + tmp*10 + (s[j]-'0');
          tmp = 0;
        }else{
          tmp = tmp*10 + (s[j]-'0');
        }
      }
      tmp_sum = tmp_sum + tmp*10 + (s[len-1]-'0');
      sum+=tmp_sum;
    }
    
    System.out.println(sum);
    System.out.flush();
    
  }
}