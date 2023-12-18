mport java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] max = new int[3];
        for(int i=0;i<3;i++){
            max[i]=0;

        }
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<10;i++){

            int val = scan.nextInt();

            if(max[0]<val){
                if(max[1]<val){
                    if(max[2]<val){
                        int tmp = max[2];
                        int tmp2 = max[1];
                        max[2]=val;
                        max[1] = tmp;
                        max[0] = tmp2;


                    }
                    else{
                        int tmp = max[1];
                        max[1]=val;
			max[0] =tmp;

                    }
                }
                else{
                    max[0]=val;
		}
            }
	}

        for(int i=0;i<3;i++){
            System.out.println(max[2-i]);
	}
    }
}