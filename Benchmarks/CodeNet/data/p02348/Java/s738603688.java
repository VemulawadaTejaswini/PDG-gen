import java.util.Scanner;

public class Main {
    static int N = 200005;
    static int tree[];//start from 0, with all uncertain value
    //data structure: tree from 0
    //how to represent the tree node,
    //node: the segment of the
    public static void main(String[] args) {
        int n,m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        tree = new int[N];
        for(int i = 0; i<N; i++){
            tree[i] = 2147483647;
        }
        //make entir tree-> get the max n fir ti 2^n
        int nMax = 1;
        n = n-1;
        while(n>0){
            n = n/2;
            nMax = nMax<<1;
        }
        if(nMax==1) nMax = 2;
        //start from 0
        for(int i = 0; i<m; i++){
            int temp = 0;//decide the type of operation
            int x,y, val;
            temp = in.nextInt();
            if(temp==0){
                x = in.nextInt();
                y = in.nextInt();
                val = in.nextInt();
                update(x,y,val,0,nMax-1,0);
                /*for(int j = 0;j <=2*nMax-2;j++){
                    System.out.println(j+": "+tree[j]);
                }*/
            } else {
                x = in.nextInt();
                int res = find(x,x,0,nMax-1,0);
                System.out.println(res);
            }

        }
    }

    private static int find(int x,int y, int left, int right,int nodeId) {
        if(left>y || right<x) return -1;
        else if(left<=x && right>=y && tree[nodeId]>=0){//search range > than,could be -1
            return tree[nodeId];
        } else{
            int num1 = find(x,y,left,(left+right)/2,nodeId*2+1);
            int num2 = find(x,y,(left+right)/2+1,right,nodeId*2+2);
            return Math.max(num1,num2);
        }

    }
    //update the value
    //top down
    private static void update(int x, int y, int val, int left, int right,int nodeId) {
        //int mid = (left+right)/2;
        //when to stop: there is only one node
        //if(mid>right) return;
        if(x>right||y<left) return;//out of range
        //when to update
        //how to view this tree
        if(x<=left && y>=right){
            tree[nodeId] = val;
        }else{//update the tree//go left and right
            if(tree[nodeId] >=0){
                tree[nodeId*2+1] = tree[nodeId];
                tree[nodeId*2+2] = tree[nodeId];
                tree[nodeId] = -1;
            }
            update(x,y,val,left,(left+right)/2,nodeId*2+1);
            update(x,y,val,(left+right)/2+1,right,nodeId*2+2);
        }
    }
}

