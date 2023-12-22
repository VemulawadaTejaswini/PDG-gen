import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] array = {1,2,3};
        
        for(int i=0 ; i<3 ; i++){
            if((array[i]==a)||(array[i]==b)){
                array[i] = 0;
            }
        }
        
        for(int i=0 ; i<3 ; i++){
            if(array[i]!=0){
                System.out.println(array[i]);
                return;
            }
        }
    }
}