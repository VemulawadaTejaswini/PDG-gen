import java.util.*;  
class Main{  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);  
        while(sc.hasNext()){  
            int n=sc.nextInt();  
            int a[]=new int[n];  
            for(int i=0;i<n;i++){  
                a[i]=sc.nextInt();  
            }  
            int multipleAll=multiple(a,0);  
            System.out.println(multipleAll);  
        }  
    }  
    public static int divstor(int x,int y){//求2个数的最大公约数  
        int min = x < y ? x : y ;    //取两个数的较小的那个  
        for(int divstorX = min ; divstorX > 0 ; divstorX--){  
            if(x%divstorX==0&&y%divstorX==0){      
                //从较小的那个数开始逐渐往后寻找直到找到可以同时整除这2个数的数就是最大公约数  
                return divstorX;  
            }  
        }  
        return 1;  
    }  
    public static int multiple(int a[],int count){  
        //count表示从0开始，因为数组是从0开始的（后面也是这样）也就是从第一个数开始  
          
        int divstorX=divstor(a[count],a[count+1]);      
        //求第count-1个数与第count个数的最大公约数  
          
        int multipleX=a[count]/divstorX*a[count+1];  
        //求这2个数的最小公倍数      
        //这句不能是int multipleX=a[count]*a[count+1]/divstorX；  
        //虽然结果是一样的，但是先把2个int相乘可能会超过int的范围，所以先除，在乘，可以防止越界  
          
        a[count+1]=multipleX;          
        //把2个数的最小公倍数赋值给后面那个数也就是第count+2个数  
          
        count++;    //使标记转到第count+2个数  
          
        if(count!=a.length-1){    //如果count不是在倒数第二个数  
            return multiple(a,count);  
            //在求第count+1个数开始与第count+2个数的最小公倍数  
        }  
          
        return multipleX;    //求完之后返回这个数组的最小公倍数  
    }  
}  
