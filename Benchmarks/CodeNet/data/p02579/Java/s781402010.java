//package Quarantine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int h=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int ch=Integer.parseInt(st.nextToken())-1;
        int cw=Integer.parseInt(st.nextToken())-1;
        st=new StringTokenizer(br.readLine());
        int dh=Integer.parseInt(st.nextToken())-1;
        int dw=Integer.parseInt(st.nextToken())-1;
        char c[][]=new char[h][w];
        for(int i=0;i<h;i++){
            c[i]=br.readLine().toCharArray();
        }
        Triplet a[][]=new Triplet[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                a[i][j]=new Triplet(i,j,Integer.MAX_VALUE/100);
            }
        }
        a[ch][cw]=new Triplet(ch,cw,0);
        ArrayList<Triplet> friends[][]=new ArrayList[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                friends[i][j]=new ArrayList<>();
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(c[i][j]=='#'){
                    continue;
                }
                for(int x=-2;x<=2;x++){
                    for(int y=-2;y<=2;y++){
                        int cx=i+x;
                        int cy=j+y;
                        if(isSafe(cx,cy,h,w)&&c[cx][cy]=='.'){
                            if(y==0&&(x==-1||x==1)){
                                friends[i][j].add(new Triplet(cx,cy,0));
                            }
                            else if(x==0&&(y==-1||y==1)){
                                friends[i][j].add(new Triplet(cx,cy,0));
                            }
                            else{
                                friends[i][j].add(new Triplet(cx,cy,1));
                            }
                        }
                    }
                }
            }
        }
        PriorityQueue<Triplet> queue=new PriorityQueue<>();
        queue.add(a[ch][cw]);
        while(!queue.isEmpty()){
            Triplet curr=queue.remove();
//            System.out.println(curr.toString());
            if(curr.x==dh&&curr.y==dw){
                System.out.println(curr.d);
                return;
            }
            for(Triplet f:friends[curr.x][curr.y]){
                int fx=f.x,fy=f.y;
                int currd=a[fx][fy].d;
                int tempd=curr.d+f.d;
                if(tempd<currd){
                    a[fx][fy]=new Triplet(fx,fy,tempd);
                    queue.add(a[fx][fy]);
                }
            }
        }
        System.out.println(-1);
    }
    public static boolean isSafe(int x,int y,int m,int n){
        return x>=0&&x<m&&y>=0&&y<n;
    }
}

class Triplet implements Comparable<Triplet>{
    int x,y,d;
    public Triplet(int x,int y,int d){
        this.x=x;
        this.y=y;
        this.d=d;
    }

    @Override
    public int compareTo(Triplet o) {
        return this.d-o.d;
    }

    @Override
    public String toString() {
        return this.x+" "+this.y+" "+this.d;
    }
}

