import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ary[] = {1,2,4,8,16,32,64};
      	int ans = 0;
      	for(int i = 0; i < ary.length; i++)
        {
          if(ary[i] <= num)
          {
          		ans = ary[i];
          }
        }
      
        System.out.println(ans);
      
    }
}