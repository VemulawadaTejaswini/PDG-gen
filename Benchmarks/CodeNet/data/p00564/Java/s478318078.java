import java.util.Scanner;

class PenSet{
        int number;
        int value;

        PenSet(int x,int y){
                number = x;
                value = y;
        }
}

class Pencils{
        public static void main(String[] args){
                int val,num,setNum,i,j,min=0;

                Scanner scn = new Scanner(System.in);
                num = scn.nextInt();
                setNum = scn.nextInt();
                val = scn.nextInt();
                PenSet x = new PenSet(setNum,val);
                setNum = scn.nextInt();
                val = scn.nextInt();
                PenSet y = new PenSet(setNum,val);

                for(i=-1;i*x.number<num;i++){
                        for(j=0;(i+1)*x.number+j*y.number<num;j++);
                        if(i==-1||((i+1)*x.value + j*y.value)<min)
                                min=((i+1)*x.value + j*y.value);
                }

                System.out.println(min);

        }
}
