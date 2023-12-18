import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Dropping Ink
 */
public class Main{
    /** 紙の１辺のサイズ */
    private static final int PAPER_SIZE = 10;
    
    /** 小サイズのインキ滴の１辺のサイズ */
    private static final int SMALL_INK_DROP_SIZE = 3;
    /** 小サイズのインキ滴の色の着く範囲 */
    private static final boolean[] SMALL_INK_DROP =
        {
           false, true, false,
           true , true, true,
           false, true, false
        };
    
    /** 中サイズのインキ滴の１辺のサイズ */
    private static final int MEDIUN_INK_DROP_SIZE = 3;
    /** 中サイズのインキ滴の色の着く範囲 */
    private static final boolean[] MEDIUM_INK_DROP =
        {
           true, true, true,
           true, true, true,
           true, true, true
        };
    
    /** 大サイズのインキ滴の１辺のサイズ */
    private static final int LARGE_INK_DROP_SIZE = 5;
    /** 大サイズのインキ滴の色の着く範囲 */
    private static final boolean[] LARGE_INK_DROP =
        {
           false, false, true, false, false,
           false, true,  true, true,  false,
           true,  true,  true, true,  true,
           false, true,  true, true,  false,
           false, false, true, false, false
        };
    
    /** 紙を表す配列 */
    private static int[] paper= new int[PAPER_SIZE * PAPER_SIZE];
    /** 色の着いたマスの数 */
    private static int droppedCount = 0;
    /** 色の濃さの最大値 */
    private static int maxDropping = 0;
    
    /**
     * エントリポイント
     */
    public static void main(String args[]) throws IOException {        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        while(true) {
            input = br.readLine();
            /** 最後まで読みこんだら終了 */
            if(input == null) break;
            
            /** 入力の１行を読み込み */
            String[] splittedStr = input.split(",");
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);
            int dropSize = Integer.parseInt(splittedStr[2]);
            
            /** インクを落とす */
            dropInk(x, y, dropSize);
        }
        
        /** 結果表示 */
        System.out.println(PAPER_SIZE * PAPER_SIZE - droppedCount);
        System.out.println(maxDropping);
    }
    
    /**
     * インクを落として紙に色を塗る
     * 入力のインクサイズに合わせて、落とす対象のインクの定数を切り替え
     */
    public static void dropInk(int x, int y, int inkSize) {
        switch(inkSize) {
        case 1:
            dropInk(x, y, SMALL_INK_DROP_SIZE, SMALL_INK_DROP);
            break;
        case 2:
            dropInk(x, y, MEDIUN_INK_DROP_SIZE, MEDIUM_INK_DROP);
            break;
        case 3:
            dropInk(x, y, LARGE_INK_DROP_SIZE, LARGE_INK_DROP);
            break;
        }
    }
    
    /** 
     * インクを落として紙に色を塗る
     * 引数で渡されたインキ滴について、処理を実施する。
     */
    private static void dropInk(int x, int y, int dropSize, boolean[] drop) {
        for(int i = 0; i < dropSize; i++) {
            // 色を塗る判定を実施する位置（X軸）
            int tx = x - dropSize / 2 + i;
            
            // 紙の外になる場合、処理をスキップ
            if(tx < 0) continue;
            if(tx >= PAPER_SIZE) break;
            
            for(int j = 0; j < dropSize; j++) {
                // インク的を塗るマスでなければ処理をスキップ
                if(!drop[i * dropSize + j]) continue;
                
                // 色を塗る判定を実施する位置（Y軸）
                int ty = y - dropSize /2 + j;
                
                // 紙の外になる場合、処理をスキップ
                if(ty < 0) continue;
                if(ty >= PAPER_SIZE) break;
                
                // 色が塗られているマスの数をカウント
                if(paper[tx * PAPER_SIZE + ty]++ == 0 ) {
                    droppedCount++;
                }
                // 最も濃い色の濃度を更新
                if(maxDropping < paper[tx * PAPER_SIZE + ty]) {
                    maxDropping = paper[tx * PAPER_SIZE + ty];
                }
            }
        }
    }
}