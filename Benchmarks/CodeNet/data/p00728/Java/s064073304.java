import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
        int num=scan.nextInt();
        if(num==0){
            break;
        }
        int[] data=new int[num];
        int max=0,min=0,sum=0;
        for(int i=0;i<num;i++){
            data[i]=scan.nextInt();
            if(i==0){
                max=data[i];
                min=data[i];
            }
            else if(data[i]>max){
                max=data[i];
            }
            else if(data[i]<min){
                min=data[i];
            }
            sum=sum+data[i];
        }
        System.out.println((sum-min-max)/(num-2));
    }
  }
}
