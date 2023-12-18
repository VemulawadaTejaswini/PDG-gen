import Data.List

main = do
    getContents >>= putStr . solve

solve :: String -> String
solve = unlines . map show . take 3 . reverse . sort . map (\x -> read x :: Int) . lines