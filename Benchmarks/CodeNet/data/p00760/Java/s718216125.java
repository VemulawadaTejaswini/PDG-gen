import java.util.Scanner;
class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=0;i<num;i++){
            int[] data=new int[3];
            for(int j=0;j<data.length;j++){
                data[j]=scan.nextInt();
            }
            System.out.println(millennium(data));
        }
    }
    private static int millennium(int[] data){
        int count=0;
        while(true){
            boolean flag=false;
            if(data[0]==1000){
                break;
            }
            data[2]++;
            if(data[0]%3==0){
                flag=true;
            }
            if(data[1]%2==1){
                flag=true;
            }
            if(data[2]>=20){
                if(!flag){
                    data[1]++;
                    data[2]=1;
                }
                else if(data[2]==21){
                    data[1]++;
                    data[2]=1;
                }
            }
            if(data[1]>=11){
                data[0]++;
                data[1]=1;
            }
            count++;
        }
        return count;
    }
}
