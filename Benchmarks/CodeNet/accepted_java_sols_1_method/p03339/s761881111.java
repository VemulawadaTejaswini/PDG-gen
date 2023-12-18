import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s      = sc.nextInt();
        String str = sc.next();

        boolean[] way = new boolean[s];
        int e_num = 0;
        for(int i=0; i<s; i++){
            if(str.charAt(i) == 'E'){ way[i] = true; e_num++;}
            else                    { way[i] = false;        }
        }
        int count = 0;
        int min = e_num;
        for(int i=0; i<s; i++){
            if(way[i] == true){ count--; }
            else              { count++; }
            if(count + e_num < min)   { min = count + e_num; }
        }
        System.out.println(min);
    }
}