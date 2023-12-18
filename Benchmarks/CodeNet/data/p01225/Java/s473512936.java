import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int data[][]=new int [T][9];
        String color[][]=new String[T][9];
        for(int i=0; i<T; i++)
        {
            //????????????
            for(int j=0; j<9; j++)
            {
                data[i][j]=sc.nextInt();
            }
            for(int j=0; j<9; j++)
            {
                color[i][j]=sc.next();
            }
            //??°????????¨???????????????????????????
            for(int j=0; j<4; j++)
            {
                for(int k=0; k<8; k++)
                {
                    if(data[i][k]>=data[i][k+1])
                    {
                        int temp = data[i][k];
                        data[i][k]=data[i][k+1];
                        data[i][k+1]=temp;
                        String ctemp = color[i][k];
                        color[i][k]=color[i][k+1];
                        color[i][k+1]=color[i][k];
                    }
                }
            }
            //??????????????????????????????
            for(int j=0; j<4; j++)
            {
                for(int k=0; k<8; k++)
                {
                    if(color[i][k].compareTo(color[i][k+1])>=0 && data[i][k]==data[i][k+1])
                    {
                        int temp = data[i][k];
                        data[i][k]=data[i][k+1];
                        data[i][k+1]=temp;
                        String ctemp = color[i][k];
                        color[i][k]=color[i][k+1];
                        color[i][k+1]=color[i][k];
                    }
                }
            }
            //?????¨??????????????????????????¨???????????£?????????(????????????????????????????????£
            if((((data[i][0]==data[i][1] && data[i][1]==data[i][2]) || (data[i][0]==data[i][1]-1 && data[i][1]==data[i][2]-1))&&
                    (color[i][0]==color[i][1] && color[i][1]==color[i][2])) &&
                    (((data[i][3]==data[i][4] && data[i][4]==data[i][5]) || (data[i][3]==data[i][4]-1 && data[i][4]==data[i][5]-1))&&
            (color[i][3]==color[i][4] && color[i][4]==color[i][5])) &&
                    (((data[i][6]==data[i][7] && data[i][7]==data[i][8]) || (data[i][6]==data[i][7]-1 && data[i][7]==data[i][8]-1))&&
                            (color[i][6]==color[i][7] && color[i][7]==color[i][8])) )
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
        sc.close();
    }
}