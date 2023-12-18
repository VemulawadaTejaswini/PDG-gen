
import java.util.*;
class Main {

    public static int kaijo(int n)
    {
        int result = 1;
        for(int i = 1 ; i<=n; i++)
        {
            result*=i;
        }
        return result;
    }
    public static int Array2id(short[] array)
    {
        //??????????????????
        short temp[] = new short[8];
        for(int i=0; i<8; i++)
        {
            temp[i]=array[i];
        }
        int result = 0;
        for(int i=0; i<7; i++)
        {
            result+=(temp[i])*kaijo(7-i);
            for(int j=i+1; j<8; j++)
            {
                if(temp[i]<temp[j])
                {
                    temp[j]--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short done[] = new short[kaijo(8)];
        short array[][] = new short[kaijo(8)][8];
        while(sc.hasNext()) {

            for (int i = 0; i < kaijo(8); i++) {
                done[i] = 0;
            }
            //????±?
            int n = 0;
            //????????°
            int num = 1;
            //????????????????????????
            int start = 0;
            for (int i = 0; i < 8; i++) {
                array[0][i] = sc.nextShort();
            }
            while (true) {
                n++;
                int ntemp = num;
                for (int i = start; i < num; i++) {

                    //?????¨??????????????°???????????????????????????
                    done[Array2id(array[i])] = -1;
                    //0??????????????¢?´¢
                    int zpos = -1;
                    for (int j = 0; j < 8; j++) {
                        if (array[i][j] == 0) {
                            zpos = j;
                            break;
                        }
                    }
                    //???????????¢

                    short tarray[] = new short[8];
                    for (int j = 0; j < 8; j++) {
                        tarray[j] = array[i][j];
                    }
                    tarray[zpos] = tarray[(zpos + 4) % 8];
                    tarray[(zpos + 4) % 8] = 0;
                    if (done[Array2id(tarray)] != -1) {
                        ntemp++;
                        array[ntemp] = tarray;
                    }


                    //???????§????
                    if (zpos % 4 != 3) {
                        short temparray[] = new short[8];
                        for (int j = 0; j < 8; j++) {
                            temparray[j] = array[i][j];
                        }
                        temparray[zpos] = temparray[zpos + 1];
                        temparray[zpos + 1] = 0;
                        if (done[Array2id(temparray)] != -1) {
                            ntemp++;
                            array[ntemp] = temparray;
                        }
                    }
                    //???????§????
                    if (zpos % 4 != 0) {
                        short temparray[] = new short[8];
                        for (int j = 0; j < 8; j++) {
                            temparray[j] = array[i][j];
                        }
                        temparray[zpos] = temparray[zpos - 1];
                        temparray[zpos - 1] = 0;
                        if (done[Array2id(temparray)] != -1) {
                            ntemp++;
                            array[ntemp] = temparray;
                        }
                    }
                }
                start = num + 1;
                num = ntemp + 1;
                if (done[0] == -1) {
                    break;
                }
            }
            System.out.println(n - 1);
        }
        sc.close();
    }
}