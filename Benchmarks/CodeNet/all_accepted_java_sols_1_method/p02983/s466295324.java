import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    long l, r;
	
    l = sc.nextLong();
    r = sc.nextLong();

    long min = (l*r)%2019;

    if(min == 0)
    {
        System.out.println(0);
        System.exit(0);
    }

    long tmp;
    /*
    if(l >= 2019){
        for(int i = 1; i<r-l+1; i++)
        {  
            tmp = (l+i)%2019;
            if(tmp==0){
                System.out.println(0);
                System.exit(0);
            }
            else if(min > tmp){
                min = tmp;
            }
        }
    }
    else{
    */
        for(int i = 0; i<r-l; i++){
            for(int j = 1; j < r-l+1; j++){
                tmp = ((l+i)*(l+j))%2019;
                if(tmp==0){
                    System.out.println(0);
                    System.exit(0);

                }
                else if(min > tmp){
                    min = tmp;
                }
            }
        }
    //}
    System.out.println(min);
  }
}