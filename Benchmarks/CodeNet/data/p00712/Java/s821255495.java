
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while (true) {
            String[] line = reader.readLine().split(" ");
            int p = Integer.parseInt(line[0]), q = Integer.parseInt(line[1]), a = Integer.parseInt(line[2]), n = Integer.parseInt(line[3]);
            if(q == 0) {
                break;
            }
            int[] combination = new int[n];
            int gcd = gcd(p, q);

            p=p/gcd;
            q=q/gcd;
            int count = 0;
            for(int i0=1; i0<=a; i0++){
                if(i0==q && p == 1){
                    count++;
                    continue;
                }
                for(int i1=1; i1<=i0&&n>=2&&i0*i1<=a; i1++){
                    if((i0+i1)*q == i0*i1*p){
                        count++;
                        continue;
                    }
                    for(int i2=1; i2<=i1&&n>=3&&i0*i1*i2<=a; i2++){
                        if((i0*i1+i1*i2+i0*i2)*q == i0*i1*i2*p){
                            count++;
                            continue;
                        }
                        for(int i3=1; i3<=i2&&n>=4&&i0*i1*i2*i3<=a; i3++){
                            if((i0*i1*i2+i0*i1*i3+i0*i2*i3+i1*i2*i3)*q == i0*i1*i2*i3*p){
                                count++;
                                continue;
                            }
                            for(int i4=1; i4<=i3&&n>=5&&i0*i1*i2*i3*i4<=a; i4++){
                                if((i1*i2*i3*i4+i0*i2*i3*i4+i0*i1*i3*i4+i0*i1*i2*i4+i0*i1*i2*i3)*q == i0*i1*i2*i3*i4*p){
                                    count++;
                                    continue;
                                }
                                for(int i5=1; i5<=i4&&n>=6&&i0*i1*i2*i3*i4*i5<=a; i5++){
                                    if((i1*i2*i3*i4*i5+i0*i2*i3*i4*i5+i0*i1*i3*i4*i5+i0*i1*i2*i4*i5+i0*i1*i2*i3*i5+i0*i1*i2*i3*i4)*q == i0*i1*i2*i3*i4*i5*p){
                                        count++;
                                        continue;
                                    }
                                    for(int i6=1; i6<=i5&&n>=7&&i0*i1*i2*i3*i4*i5*i6<=a; i6++){
                                        if((i1*i2*i3*i4*i5*i6+i0*i2*i3*i4*i5*i6+i0*i1*i3*i4*i5*i6+i0*i1*i2*i4*i5*i6+i0*i1*i2*i3*i5*i6+i0*i1*i2*i3*i4*i6+i0*i1*i2*i3*i4*i5)*q == i0*i1*i2*i3*i4*i5*i6*p){
                                            count++;
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);

        }

    }



    public static int gcd(int x, int y){
        if(x>y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        if(x == 0){
            return y;
        }
        return gcd(y % x, x);
    }
}