class AOJ0118 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int result = 0;
        while(true){
            int W = input.nextInt();
            int H = input.nextInt();
            if(W < 0 || H < 0 || (W <= 0 && H <= 0))
                break;
            char[][] array = new char[H][W];
            for(int i = 0;i < H;i++){
                array[i] = input.next().toCharArray();
            }
            for(int i = 0;i < H;i++){
                for(int j = 0;j < W;j++){
                    char fruit = array[i][j];
                    if(fruit == '@' || fruit == '#' || fruit == '*'){
                        result++;
                        dfs(array,i,j,fruit);
                    }
                }
            }
            System.out.println(result);
            result = 0;
        }
    }
    public static void dfs(char[][] array,int x,int y,char fruit){
        array[x][y] = '!';
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};
        for(int i = 0;i < 4;i++){
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx >= 0 && tx < array.length && ty >= 0 && ty < array[0].length && array[tx][ty] == fruit)
                dfs(array,tx,ty,fruit);
        }
    }
}
