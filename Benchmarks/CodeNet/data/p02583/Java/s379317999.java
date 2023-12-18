import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int N,sum=0;


        N=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++)
        list.add(sc.nextInt());

        if(N<3){
            System.out.print(0);
            System.exit(0);
        }

        Collections.sort(list);

    for(int i=0;i<N-2;i++){
		for(int j=i+1;j<N-1;j++){
			for (int k = j + 1;k < N;k++) {
                
                if(list.get(i)!=list.get(j)&&list.get(j)!=list.get(k)&&list.get(k)!=list.get(i)){
                    if((long)list.get(i)+(long)list.get(j)>(long)list.get(k)){
                        sum++;
                    }
                }
            }
        }
    }

        System.out.println(sum);
    }
}
