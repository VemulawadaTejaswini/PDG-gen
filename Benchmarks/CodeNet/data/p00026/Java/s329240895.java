import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    private static final int PAPER_SIZE = 10;
    private int[] paper;
    private int droppedCount;
    private int maxDropping;
    
    private static final int SMALL_INK_DROP_SIZE = 3;
    private static final boolean[] SMALL_INK_DROP =
        {
           false, true, false,
           true , true, true,
           false, true, false
        };
    
    private static final int MEDIUN_INK_DROP_SIZE = 3;
    private static final boolean[] MEDIUM_INK_DROP =
        {
           true, true, true,
           true, true, true,
           true, true, true
        };
        
    private static final int LARGE_INK_DROP_SIZE = 5;
    private static final boolean[] LARGE_INK_DROP =
        {
           false, false, true, false, false,
           false, true,  true, true,  false,
           true,  true,  true, true,  true,
           false, true,  true, true,  false,
           false, false, true, false, false
        };
    
    
    public static void main(String args[]) throws IOException {
        Main app = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        while(true) {
            input = br.readLine();
            if(input == null) break;
            
            String[] splittedStr = input.split(",");
            
            int x = Integer.parseInt(splittedStr[0]);
            int y = Integer.parseInt(splittedStr[1]);
            int dropSize = Integer.parseInt(splittedStr[2]);
            
            app.dropInk(x, y, dropSize);
        }
        
        System.out.println(PAPER_SIZE * PAPER_SIZE - app.getDroppedCount());
        System.out.println(app.getMaxDropping());
        
        app.printPaper();
    }
    
    public Main() {
        this.paper = new int[PAPER_SIZE * PAPER_SIZE];
        this.droppedCount = 0;
        this.maxDropping = 0;
    }
    
    public void dropInk(int x, int y, int inkSize) {
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
    
    private void dropInk(int x, int y, int dropSize, boolean[] drop) {
        for(int i = 0; i < dropSize; i++) {
            int tx = x - dropSize / 2 + i;
            if(tx < 0) continue;
            if(tx >= PAPER_SIZE) break;
            
            for(int j = 0; j < dropSize; j++) {
                if(!drop[i * dropSize + j]) continue;
                
                int ty = y - dropSize /2 + j;
                if(ty < 0) continue;
                if(ty >= PAPER_SIZE) break;
                
                if(this.paper[tx * PAPER_SIZE + ty]++ == 0 ) {
                    this.droppedCount++;
                }
                if(this.maxDropping < this.paper[tx * PAPER_SIZE + ty]) {
                    this.maxDropping = this.paper[tx * PAPER_SIZE + ty];
                }
            }
        }
        printPaper();
    }

    public int getDroppedCount() { return this.droppedCount; }
    public int getMaxDropping() { return this.maxDropping; }
    
    public void printPaper() {
        for(int i = 0; i < PAPER_SIZE * PAPER_SIZE; i++) {
            System.out.print(paper[i] + ", ");
            if((i + 1) % PAPER_SIZE == 0)System.out.println();
        }
        System.out.println();
    }
}