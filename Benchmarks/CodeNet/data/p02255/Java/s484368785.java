import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int length;
        int tmp;
        length=cin.nextInt();
        int list[] = new int[length];
        
        for(int i=0;i<lenght-1;i++){
            list[i] = cin.nextInt();        
        }
        for(int j = 0;j<length-1;j++){
            tmp = list[j];
            if(j-1>=0 && list[j-1]>tmp){
                list[j] = list[j-1];
                list[j-1] = tmp;
            }
            System.out.println(list);
        }
        
    }
}