import Control.Monad
import Control.Applicative
import Data.List
  
main :: IO ()
main = do
  n <- readLn :: IO Int
  if n == 0
    then return ()
    else do
    ns <- getData n
    let ans = solve ns
    if null ans then putStrLn "NA"
                else mapM_ print ans
    main
  
getData :: Int -> IO [((Int, Int), Int)]
getData n = go 0
  where
    go :: Int -> IO [((Int, Int), Int)]
    go m
      | m == n = return []
      | otherwise = do
          [i, x, y] <- map read . words <$> getLine :: IO [Int]
          (:) ((m, i), x * y) <$> go (m+1)

solve :: [((Int, Int), Int)] -> [Int]
solve ns = map fst
           $ sortBy (\(x,_) (x2,_) -> compare x x2)
           $ filter ((>= 1000000) . snd)
           $ map (\ls -> (snd (fst (head ls)), sum (map snd ls)))
           $ groupBy (\((_, y1), _) ((_, y2), _) -> y1 == y2)
           $ sortBy (\((_, y1), _) ((_, y2), _) ->
                       compare y1 y2) ns