import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());
        int tx = Integer.parseInt(st.nextToken());
        int ty = Integer.parseInt(st.nextToken());

        StringBuilder ans=new StringBuilder();
        //first
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(ty>=sy)
                ans.append("U");
            else
                ans.append("D");
        }
        for(int i=0;i<Math.abs(tx-sx);i++){
            if(tx>=sx)
                ans.append("R");
            else
                ans.append("L");
        }
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(sy>=ty)
                ans.append("U");
            else
                ans.append("D");
        }
        for(int i=0;i<Math.abs(tx-sx);i++){
            if(sx>=tx)
                ans.append("R");
            else
                ans.append("L");
        }

        //second
        if(tx>=sx)
            ans.append("L");
        else
            ans.append("R");
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(ty>=sy)
                ans.append("U");
            else
                ans.append("D");
        }
        if(ty>=sy)
            ans.append("U");
        else
            ans.append("D");

        for(int i=0;i<Math.abs(tx-sx);i++){
            if(tx>=sx)
                ans.append("R");
            else
                ans.append("L");
        }
        if(tx>=sx)
            ans.append("R");
        else
            ans.append("L");
        
        if(ty>=sy)
            ans.append("D");
        else
            ans.append("U");

        if(tx>=sx)
            ans.append("R");
        else
            ans.append("L");
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(sy>=ty)
                ans.append("U");
            else
                ans.append("D");
        }
        if(sy>=ty)
            ans.append("U");
        else
            ans.append("D");

        for(int i=0;i<Math.abs(tx-sx);i++){
            if(sx>=tx)
                ans.append("R");
            else
                ans.append("L");
        }
        if(sx>=tx)
            ans.append("R");
        else
            ans.append("L");
        
        if(sy>=ty)
            ans.append("D");
        else
            ans.append("U");

        if(sx==tx && sy==ty)
            System.out.println("URDLDLUR");
        else
            System.out.println(ans.toString());

    }

}
